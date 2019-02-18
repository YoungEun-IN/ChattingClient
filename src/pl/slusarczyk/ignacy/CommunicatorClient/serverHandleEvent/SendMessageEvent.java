package pl.slusarczyk.ignacy.CommunicatorClient.serverHandleEvent;

import java.io.Serializable;
import pl.slusarczyk.ignacy.CommunicatorServer.model.data.UserName;

/**
 * ������ �޼����� �۽��ϱ� ���ؼ� ��ư�� ������ �̺�Ʈ�� ����ϴ� Ŭ����
 */
public class SendMessageEvent extends ServerHandleEvent implements Serializable
{
	private static final long serialVersionUID = 1L;
	/**���� �̸�*/
	private final String roomName;
	/**����� �̸�*/
	private final UserName userName;
	/**����ڰ� �������� �޽���*/
	private final String message;
	
	/**
	 * �־��� �Ű� ������ ������� �̺�Ʈ�� ����� ������
	 * 
	 * @param roomName
	 * @param userID 
	 * @param message
	 */
	public SendMessageEvent (final String roomName,final UserName userName,final String message)
	{
		this.roomName = roomName;
		this.userName = userName;
		this.message = message;
	}
	
	/**
	 * ������ ����ڰ��ִ� ���� �̸��� ��ȯ 
	 * 
	 * @return roomName
	 */
	public String getRoomName()
	{
		return roomName;
	}
	
	/**
	 * �޽����� ���� ������� ID�� ��ȯ
	 * 
	 * @return userName
	 */
	public UserName getUserName ()
	{
		return userName;
	}
	
	/**
	 * ����ڰ� ���� �޽����� ��ȯ
	 * 
	 * @return message
	 */
	public String getMessage ()
	{
		return message;
	}
}