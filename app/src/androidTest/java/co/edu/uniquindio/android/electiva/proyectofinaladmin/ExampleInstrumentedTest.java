package co.edu.uniquindio.android.electiva.proyectofinaladmin;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <Grupo href="http://d.android.com/tools/testing">Testing documentation</Grupo>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("co.edu.uniquindio.android.electiva.proyectofinaladmin", appContext.getPackageName());
    }
}
