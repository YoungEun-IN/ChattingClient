package pl.slusarczyk.ignacy.CommunicatorClient.serverHandleEvent;

import java.io.Serializable;
import pl.slusarczyk.ignacy.CommunicatorServer.model.data.UserName;

/**
 * 채팅 종료 버튼을 누른 사용자의 이벤트를 설명하는 클래스입니다.
 */
public class QuitChattingEvent extends ServerHandleEvent implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 채팅을 떠난 사용자의 이름 */
	private final UserName userName;
	/** 사용자를 찾을 방의 이름 */
	private final String roomName;

	/**
	 * 주어진 매개 변수를 기반으로 이벤트를 만드는 생성자
	 * 
	 * @param userName
	 * @param roomName
	 */
	public QuitChattingEvent(final UserName userName, final String roomName) {
		this.userName = userName;
		this.roomName = roomName;
	}

	/**
	 * 사용자의 이름을 반환
	 *
	 * @return userName
	 */
	public UserName getUserName() {
		return userName;
	}

	/**
	 * 방 이름을 반환
	 * 
	 * @return roomName
	 */
	public String getRoomName() {
		return roomName;
	}
}
