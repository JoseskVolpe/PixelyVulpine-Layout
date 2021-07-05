package pixelyvulpine.test.scenes;

import java.io.IOException;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

import pixelyvulpine.api.lcdui.Color;
import pixelyvulpine.api.lcdui.Command;
import pixelyvulpine.api.lcdui.Content;
import pixelyvulpine.api.lcdui.ContentListener;
import pixelyvulpine.api.lcdui.Layout;
import pixelyvulpine.contents.Button;
import pixelyvulpine.contents.Canvas;
import pixelyvulpine.contents.Label;
import pixelyvulpine.test.App;

public class ScrollTest extends Layout implements ContentListener{

	public ScrollTest(App app) {
		super(app);
		
		animation = ANIMATION_SLIDE_LEFT;
		
		this.setTitle("Scroll test uwu");
		
		Label l = new Label(this,  new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, this.getTitle());
		l.setColor(new Color(255,255,255));
		l.getFont().setStyle(Font.STYLE_BOLD);
		l.impact();
		l.setPositioning(Content.POSITIONING_ANCHORED);
		l.setHorizontalAnchor(Content.HORIZONTAL_ANCHOR_CENTER);
		
		Canvas LCanvas = new Canvas(this,  new int[] {0, 0}, new int[] {0, 0}, new int[] {100, 0}, new int[] {0, l.getFont().getFontSize()});
		LCanvas.addContent(l);
		LCanvas.setBackgroundColor(null);
		LCanvas.setForegroundColor(null);
		this.addContent(LCanvas);
		
		
		Label label = new Label(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Testing OwO");
		label.setBackgroundColor(new Color(150,150,150));
		label.impact();
		this.addContent(label);
		Canvas canvas = new Canvas(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 25});
		canvas.setArrangement(Canvas.ARRANGEMENT_HORIZONTAL);
		this.addContent(canvas);
		Button button = new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Boop UwU");
		button.impact();
		button.assign(this);
		this.addContent(button);
		Button button2 = new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "heeey OwO");
		button2.impact();
		button2.assign(this);
		this.addContent(button2);
		Button button3 = new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Yiff @w@");
		button3.impact();
		button3.assign(this);
		this.addContent(button3);
		
		Button cB1 = new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "A");
		cB1.impact();
		cB1.assign(this);
		canvas.addContent(cB1);
		Label cL = new Label(this, new int[] {0,0}, new int[] {0,0}, new int[] {0,90}, new int[] {0, 40}, "B");
		cL.impact();
		canvas.addContent(cL);
		Button cB2 = new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "C");
		cB2.impact();
		cB2.assign(this);
		canvas.addContent(cB2);
		
		this.addContent(new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Button"));
		this.addContent(new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Button"));
		this.addContent(new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Button"));
		this.addContent(new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Button"));
		this.addContent(new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Button"));
		this.addContent(new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Button"));
		this.addContent(new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Button"));
		this.addContent(new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Button"));
		this.addContent(new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Button"));
		this.addContent(new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Button"));
		this.addContent(new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Button"));
		this.addContent(new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Button"));
		this.addContent(new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Button"));
		this.addContent(new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Button"));
		this.addContent(new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Button"));
		this.addContent(new Button(this, new int[] {0, 0}, new int[] {0, 0}, new int[] {0, 90}, new int[] {0, 40}, "Button"));
		
		Label ml = new Label(this, new int[] {0,0}, new int[] {0,0}, new int[] {100,0}, new int[] {0,620}, "*te lambe* :3\nIsso é um teste, isso, um teste UwU\nTestando múltiplas linhas nisso aqui, só isso");
		ml.setMultiline(true);
		ml.setColor(new Color(255,255,255));
		this.addContent(ml);
		
		
	}
	
	public void Setup() {
		
		
		
		
		setFullScreenMode(true);
		//setNavigationBar(true);
		//setFullScreenMode(false);
		
		this.addCommand(new Command("Test1", Command.BACK, 1));
		this.addCommand(new Command("Test2", Command.BACK, 1));
		this.addCommand(new Command("Test3", Command.BACK, 1));
		this.addCommand(new Command("Test4", Command.BACK, 1));
		this.addCommand(new Command("Test5", Command.BACK, 1));
		this.addCommand(new Command("Test6", Command.OK, 1));
		
	}
	
	public void paintLayout(Graphics g) {
		
		
		
	}

	public boolean contentPressed(Content content) {
		
		System.out.println(((Button)content).getText());
		
		return false;
	}

	public boolean onContentLoad(Content content) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean onContentError(Content content, Throwable e) {
		// TODO Auto-generated method stub
		return false;
	}

}
