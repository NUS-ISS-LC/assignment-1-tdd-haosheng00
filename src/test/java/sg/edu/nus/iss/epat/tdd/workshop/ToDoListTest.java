package sg.edu.nus.iss.epat.tdd.workshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToDoListTest  {
    // Define Test Fixtures

    private ToDoList todolist;

    public ToDoListTest() {
        super();
    }

    @Before
    public void setUp() throws Exception {
        todolist = new ToDoList();
        todolist.addTask(new Task("Sample Task"));
    }

    @After
    public void tearDown() throws Exception {
        todolist = null;
    }

    @Test
    public void testAddTask() {
        assertEquals(1, todolist.getAllTasks().size());
    }

    @Test
    public void testGetStatus() {
        assertEquals(false, todolist.getStatus("Sample Task"));
    }

    @Test
    public void testRemoveTask() {
        assertEquals(1, todolist.getAllTasks().size());
        todolist.removeTask("Sample Task");
        assertEquals(0, todolist.getAllTasks().size());
    }

    @Test
    public void testGetCompletedTasks() {
        todolist.completeTask("Sample Task");
        assertEquals(1, todolist.getCompletedTasks().size());
        assertTrue(todolist.getStatus("Sample Task"));
    }
}