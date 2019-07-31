package dec_patt;

import java.util.logging.Logger;

public class Main_app {

	private static final Logger LOG = Logger.getLogger(Main_app.class.getName());

	public static void main(String[] args) {
		LOG.info("spelled hammer");

		Weppie spellHam = new Hammer(new DarkMag());

		spellHam.take();
		spellHam.swing();
		spellHam.putback();

		Spellie darkMag = new DarkMag();

		darkMag.activate();
		darkMag.useit();
		darkMag.deactivate();

	}
}
