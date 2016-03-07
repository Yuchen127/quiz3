package org.junit;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class triangletest {

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		}

		@Before
		public void setUp() throws Exception {
		}

		@After
		public void tearDown() throws Exception {
		}

		@Test
		public void testTriangle() {
			/*
			 * set new values to triangle class
			 */
			triangle Triangle = new triangle(3,4,5);
			
			/*
			 * test if the methods are correct
			 */
			assertEquals(12,triangle.getPerimeter());
			assertEquals(6,triangle.getArea());
		}

	}