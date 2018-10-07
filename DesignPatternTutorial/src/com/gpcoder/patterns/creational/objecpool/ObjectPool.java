package com.gpcoder.patterns.creational.objecpool;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ObjectPool<T> {
	private final AtomicInteger count = new AtomicInteger(0);
	private int expiredTimeInMilisecond = 0; // If the value <= 0, the expired time will be unlimited
	private int corePoolSize = 2;
	private int maxPoolSize = 16;

	private Map<T, Long> inUse;
	private Map<T, Long> available;

	public ObjectPool() {
		this.inUse = Collections.synchronizedMap(new HashMap<>());
		this.available = Collections.synchronizedMap(new HashMap<>());
	}

	public ObjectPool(int expiredTimeInMilisecond) {
		this.expiredTimeInMilisecond = expiredTimeInMilisecond;
	}

	protected abstract T create();

	protected abstract boolean validate(T o);

	protected abstract void expire(T o);

	protected synchronized T getObject() {
		long now = System.currentTimeMillis();
		T obj;
		if (!available.isEmpty()) {
			for (Map.Entry<T, Long> entry : available.entrySet()) {
				obj = entry.getKey();
				if (this.isExpired(now, available.get(obj))) {
					// object has expired
					available.remove(obj);
					this.expire(obj);
				} else {
					if (this.validate(obj)) {
						available.remove(obj);
						inUse.put(obj, now);
						return (obj);
					} else {
						// object failed validation
						available.remove(obj);
						this.expire(obj);
					}
				}
			}
		}
		// no objects available, create a new one
		obj = this.create();
		inUse.put(obj, now);
		return (obj);
	}

	protected synchronized void releaseObject(T t) {
		inUse.remove(t);
		available.put(t, System.currentTimeMillis());
	}

	protected boolean isExpired(long now, long theTime) {
		if (expiredTimeInMilisecond <= 0) {
			return false;
		}
		return now - theTime > expiredTimeInMilisecond;
	}
}