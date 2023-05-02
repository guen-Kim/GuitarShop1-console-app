package guitarshop2_��������;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	private static void initializeInventory(Inventory inventory) {
		// ��Ÿ���� ��� ��Ͽ� ���
		inventory.addGuitar("1", 20.0, "fender1", "Staratocastor1", "electric", "Alder", "Alder");
		inventory.addGuitar("2", 11.0, "fender1", "Staratocastor1", "electric", "Alder", "Alder");
		inventory.addGuitar("3", 42.0, "fender2", "Staratocastor2", "acoustic", "Alder", "Alder");
		inventory.addGuitar("4", 19.1, "fender2", "Staratocastor2", "acoustic", "Alder", "Alder");
		inventory.addGuitar("5", 28.3, "fender3", "Staratocastor3", "acoustic", "Alder", "Alder");
		inventory.addGuitar("6", 37.6, "fender3", "Staratocastor3", "electric", "Alder", "Alder");

	}

	public static void main(String[] args) {

		// ���� ��Ÿ ��� ��� �¾�(�ʱ�ȭ)
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		// ����ڷκ��� ��Ÿ ������ �Է� �޴´�.
		Guitar whatErinLikes = new Guitar("", 0, "fender", "Staratocastor", "electric", "Alder", "Alder");

		// ��Ī�� ��Ÿ ��ȯ
		Guitar matchingGuitars = inventory.search(whatErinLikes);

		// �˻����� ��ȯ�� ��Ī�� ��Ÿ�� ���Ͽ�
		Guitar guitar = inventory.search(whatErinLikes);

		if (guitar != null) {
			System.out.println("Erin, you might like this" + guitar.getBuilder() + " " + guitar.getModel() + " "
					+ guitar.getType() + "guitar:\n " + guitar.getBackWood() + " back and sides, \n "
					+ guitar.getTopWood() + " top. \n You can have it for only $" + guitar.getPrice() + "!");
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}

	}
}
