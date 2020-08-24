package singleton;

public class TicketMaker {
	private static TicketMaker ticketMaker = new TicketMaker();
	private int ticket = 1000;
	private TicketMaker() {
	}

	public static TicketMaker getInstance() {
		return ticketMaker;
	}

	// 複数のスレッドから呼び出せれた場合でも正しく動作するようsyncronizedを付与
	public synchronized int getNextTiketNumber() {
		return ticket++;
	}
}
