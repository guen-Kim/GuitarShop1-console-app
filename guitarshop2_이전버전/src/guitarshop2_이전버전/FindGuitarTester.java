package guitarshop2_이전버전;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	private static void initializeInventory(Inventory inventory) {
		// 기타들을 재고 목록에 등록
		inventory.addGuitar("1", 20.0, "fender1", "Staratocastor1", "electric", "Alder", "Alder");
		inventory.addGuitar("2", 11.0, "fender1", "Staratocastor1", "electric", "Alder", "Alder");
		inventory.addGuitar("3", 42.0, "fender2", "Staratocastor2", "acoustic", "Alder", "Alder");
		inventory.addGuitar("4", 19.1, "fender2", "Staratocastor2", "acoustic", "Alder", "Alder");
		inventory.addGuitar("5", 28.3, "fender3", "Staratocastor3", "acoustic", "Alder", "Alder");
		inventory.addGuitar("6", 37.6, "fender3", "Staratocastor3", "electric", "Alder", "Alder");

	}

	public static void main(String[] args) {

		// 릭의 기타 재고 목록 셋업(초기화)
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		// 사용자로부터 기타 스펙을 입력 받는다.
		Guitar whatErinLikes = new Guitar("", 0, "fender", "Staratocastor", "electric", "Alder", "Alder");

		// 매칭된 기타 반환
		Guitar matchingGuitars = inventory.search(whatErinLikes);

		// 검색으로 반환된 매칭된 기타에 대하여
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
