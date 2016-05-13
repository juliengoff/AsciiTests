package fr.imie.asciitests.entityfactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EntityFactory {
	/**
	 * Get entity of letter
	 * @param letter
	 * @return
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @throws ClassNotFoundException
	 */
	public static Object getLetter(char letter) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException{
		String entityName = "Entity" + letter;
		
		Class entityClass = Class.forName(entityName);
		Constructor constr = entityClass.getConstructor();
		Object entityLetter = constr.newInstance();
		
		return entityLetter;
	}
}