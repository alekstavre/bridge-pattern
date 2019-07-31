package dec_patt;

import java.util.logging.Logger;

public class DarkMag implements Spellie {

	private static final Logger LOG = Logger.getLogger(Spellie.class.getName());

	@Override
	public void activate() {
		LOG.info("spell active");

	}

	@Override
	public void useit() {
		LOG.info("spelling...");

	}

	@Override
	public void deactivate() {
		LOG.info("spell deactive");

	}

}
