package dec_patt;

import java.util.logging.Logger;

public class Hammer implements Weppie {

	private static final Logger LOG = Logger.getLogger(Hammer.class.getName());

	private final Spellie spell;

	public Hammer(Spellie spell) {
		this.spell = spell;
	}

	@Override
	public void take() {
		LOG.info("taken");
		spell.activate();
	}

	@Override
	public void swing() {
		LOG.info("swing");
		spell.useit();
	}

	@Override
	public void putback() {
		LOG.info("putback");
		spell.deactivate();
	}

	@Override
	public Spellie getSpell() {
		return spell;
	}

}
