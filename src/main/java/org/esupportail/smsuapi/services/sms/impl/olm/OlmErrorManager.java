package org.esupportail.smsuapi.services.sms.impl.olm;

import org.apache.log4j.Logger;

import fr.cvf.util.mgs.ErrorManager;

/**
 * Error manager for olm broker impl.
 * @author PRQD8824
 *
 */
public class OlmErrorManager implements ErrorManager {

	/**
	 * Log4j logger.
	 */
	private final Logger logger = Logger.getLogger(getClass());
	
	
	/* (non-Javadoc)
	 * @see fr.cvf.util.mgs.ErrorManager#error(int, int, java.lang.String)
	 */
	public void error(final int arg0, final int arg1, final String arg2) {
		logger.error("Error sent by lib SGS :" + 
			     " - arg0 : " + arg0 + 
			     " - arg1 : " + arg1 + 
			     " - arg2 : " + arg2);

	}

	/* (non-Javadoc)
	 * @see fr.cvf.util.mgs.ErrorManager#warning(java.lang.String)
	 */
	public void warning(final String arg0) {
		logger.warn("Warning sent by lib SGS :" +
			    " - arg0 : " + arg0);
	}
	
	/**
	 * @param xmlFrame
	 * @return
	 */
	public boolean manage(final String xmlFrame) {
		logger.debug("xmlFrame : " + xmlFrame);
		return true;
	}

}
