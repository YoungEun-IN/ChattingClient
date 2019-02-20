package chattingServer.serverSideEvent;

import java.io.Serializable;

/**
 * ����ڿ��� �˸��� �� �� �߻��ϴ� �̺�Ʈ
 */
public class AlertToClientEvent extends ServerSideEvent implements Serializable {
	private static final long serialVersionUID = 1L;
	/** ����ڿ��� ǥ�� �� �޽��� */
	private final String message;
	/** �޽����� ǥ�� �� ������� ���� ��Ű�� �̸��� ǥ�õǾ���մϴ�. */
	private final String userName;

	public AlertToClientEvent(final String message, final String userName) {
		this.message = message;
		this.userName = userName;
	}

	/**
	 * �޽��� ������ ��ȯ
	 * 
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * ���� ����� userId�� ��ȯ
	 * 
	 * @return the userID
	 */
	public String getUserName() {
		return userName;
	}
}