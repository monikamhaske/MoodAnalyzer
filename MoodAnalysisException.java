package Com.CodeBind;

public class MoodAnalysisException {
	public String message;
	public ExceptionType exceptionType;

	enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY;

	}

	public MoodAnalysisException(String message, ExceptionType type) {
		this.message = message;
		this.exceptionType = type;
	}

}

