package interfaces;

public interface LinkEventHandler {
	public void onConnected(String name, String address);
	public void onDisconnected(String name, String address);
	public void onDeactivated();
	public void onDataReceived(String name, String address, byte[] data);
}
