package chattingClient.clientSideEvent;

import java.io.Serializable;

/**
 * 사용자가 메시지를 입력하고 전송할 때 발생하는 이벤트 
 */
public class SendMessageEvent extends ClientSideEvent implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 방의 이름 */
	private final String roomName;
	/** 사용자 이름 */
	private final String userName;
	/** 사용자가 보내려는 메시지 */
	private final String message;

	/**
	 * 주어진 매개 변수를 기반으로 이벤트를 만드는 생성자
	 * 
	 * @param roomName
	 * @param userID
	 * @param message
	 */
	public SendMessageEvent(final String roomName, final String userName, final String message) {
		this.roomName = roomName;
		this.userName = userName;
		this.message = message;
	}

	/**
	 * 지정된 사용자가있는 방의 이름을 반환
	 * 
	 * @return roomName
	 */
	public String getRoomName() {
		return roomName;
	}

	/**
	 * 메시지를 보낸 사용자의 ID를 반환
	 * 
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 사용자가 보낸 메시지를 반환
	 * 
	 * @return message
	 */
	public String getMessage() {
		return message;
	}
}
