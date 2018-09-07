/*
 * https://gpcoder.com
 */
package com.gpcoder.patterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		SerializedSingleton serializedSingleton1 = SerializedSingleton.getInstance();
		EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;

		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("SingletonSerializedTest.txt"));
		out.writeObject(serializedSingleton1);
		out.writeObject(enumSingleton1);
		out.close();

		// De-serialize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("SingletonSerializedTest.txt"));
		SerializedSingleton serializedSingleton2 = (SerializedSingleton) in.readObject();
		EnumSingleton enumSingleton2 = (EnumSingleton) in.readObject();
		in.close();

		System.out.println("serializedSingleton1 hashCode=" + serializedSingleton1.hashCode());
		System.out.println("serializedSingleton2 hashCode=" + serializedSingleton2.hashCode());
		System.out.println("enumSingleton1 hashCode=" + enumSingleton1.hashCode());
		System.out.println("enumSingleton2 hashCode=" + enumSingleton2.hashCode());
	}
}
