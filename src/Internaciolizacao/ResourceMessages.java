package Internaciolizacao;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceMessages {

	private static final String BUNDLE_NAME = "messages";

	public static String getMessage(MessageEnum messageEnum, Locale locale, Object... args) {
		ResourceBundle resourceBundle = null;

		if (locale != null)
			resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME, locale);
		else
			resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME);

		String message = null;
		if (resourceBundle != null) {
			message = resourceBundle.getString(messageEnum.getProp());
			if (message != null && args.length > 0)
				message = MessageFormat.format(message, args);
		}
		return message;
	}

}
