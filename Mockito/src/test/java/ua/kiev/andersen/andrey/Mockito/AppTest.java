package ua.kiev.andersen.andrey.Mockito;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AppTest{
	
	@Mock
	private SecondObject secondObject;
	
	@InjectMocks
	private MainObject mainObject = new MainObject();

	@Test
	public void toDo(){
		mainObject.secondObject.doOrNotToDo();
		verify(secondObject).doOrNotToDo();
	}
	
}
