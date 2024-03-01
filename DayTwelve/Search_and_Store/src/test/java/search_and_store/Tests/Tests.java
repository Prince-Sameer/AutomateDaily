package search_and_store.Tests;

import org.testng.annotations.Test;

import search_and_store.Components.Base;
import serach_and_store.PageObjects.*;

public class Tests extends Base{

	SearchResult b;
	@Test
	public void test() throws Exception
	{
		SearchPage a= new SearchPage(driver);
		b=a.Search();
	}
	@Test(dependsOnMethods= {"test"})
	public void test2()
	{
		b.store();
	}
}
