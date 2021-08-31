package pixelyvulpine.test;

import java.io.IOException;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

import pixelyvulpine.Config;
import pixelyvulpine.api.lcdui.Color;
import pixelyvulpine.api.lcdui.Layout;
import pixelyvulpine.api.lcdui.LayoutLoader;
import pixelyvulpine.layouts.Logo;
import pixelyvulpine.test.scenes.*;

public class App extends MIDlet implements CommandListener, LayoutLoader {

	private static final String layoutName="scrollTest";
	//private static final String layoutName="listTest2";
	
	private boolean started = false;
	
	public App() {
		
		
		
		
	}

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		
		

	}

	protected void pauseApp() {
		
		

	}

	protected void startApp() throws MIDletStateChangeException {
	
		if(!started){
			//User open this app
			
			
			Image logoI = null;
			Image iconBack = null;
			Image iconSelec = null;
			Image iconW = null;
			Image iconM = null;
			
			try {
				logoI=Image.createImage("/joseskvolpe.png");
				iconBack=Image.createImage("/icons/dark/navbar/back.png");
				iconSelec=Image.createImage("/icons/dark/navbar/select.png");
				iconW=Image.createImage("/icons/dark/navbar/pencil.png");
				iconM=Image.createImage("/icons/dark/navbar/menu.png");
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			Config.setIcon(iconBack, Config.ICON_BACK);
			Config.setIcon(iconSelec, Config.ICON_SELECT);
			Config.setIcon(iconW, Config.ICON_WRITE);
			Config.setIcon(iconM, Config.ICON_MENU);
			Logo logo = new Logo(this, logoI, layoutName, new Color(0,0,0));
			logo.loadLayout(this);
			//Layout.setCurrent(this, logo);
			
			//new Loading(this).loadLayout(logo);
			
			//Layout.setCurrent(this, new CircularProgressBarTest(this));
			
			
		}else {
			//User resume this app
		}
		
		started = true;

	}

	public void commandAction(Command arg0, Displayable arg1) {}

	public Layout loadLayout(String layoutName) {

		/*// Force delay test
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*// Force error
		int a =0/0;
		*/
		
		if(layoutName.equals("canvasTest")){
			return new CanvasTest(this);
		}
		
		if(layoutName.equals("scrollTest")) {
			return new ScrollTest(this);
		}
		
		if(layoutName.equals("AlphaBlendingTest")) {
			return new AlphaBlendTest(this);
		}
		
		if(layoutName.equals("touchTest")) {
			return new TouchTest(this);
		}
		
		if(layoutName.equals("vibrate")) {
			return new Vibrator(this);
		}
		
		if(layoutName.equals("listTest")) {
			return new ListTest(this);
		}
		
		if(layoutName.equals("listTest2")) {
			return new ListTest2(this);
		}
		
		return null;
	}

}
