package SelectionSort;

public class SelectionSortError extends RuntimeException {
	private int errType;
	private static String[] Messages = {
			"�迭�� ũ��� 2���� ū �����̾�� �մϴ�.",
			"�迭�� ��Ҵ� ������ �� �� �����ϴ�."
	};
	public SelectionSortError(int errType) {
		this.errType = errType;
	}
	public String errMessage() {
		return Messages[errType];
	}
}
