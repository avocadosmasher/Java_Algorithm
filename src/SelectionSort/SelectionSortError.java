package SelectionSort;

public class SelectionSortError extends RuntimeException {
	private int errType;
	private static String[] Messages = {
			"배열의 크기는 2보다 큰 정수이어야 합니다.",
			"배열의 요소는 음수가 될 수 없습니다."
	};
	public SelectionSortError(int errType) {
		this.errType = errType;
	}
	public String errMessage() {
		return Messages[errType];
	}
}
