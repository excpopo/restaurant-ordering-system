package datebase;

import java.util.ArrayList;
import java.util.HashMap;

public class Warehouse extends HashMap<String, HashMap<String, Cuisine>> {//��Ʒ�ֿ�
	
	public Warehouse(){
		HashMap<String, Cuisine>pot_bottom=new HashMap<String, Cuisine>();//����keyΪ��ƷID��valueΪ��Ʒ��map
		pot_bottom.put("013",new Pot_bottomC("��������",100,"src/image/013.jpg",68.0,"013"));
		pot_bottom.put("012",new Pot_bottomC("�Ź���",100,"src/image/012.jpg",68.0,"012"));
		pot_bottom.put("017",new Pot_bottomC("ԧ�����",100,"src/image/017.jpg",68.0,"017"));
		pot_bottom.put("019",new Pot_bottomC("ţ�ͺ��",100,"src/image/019.jpg",68.0,"019"));

		
		HashMap<String, Cuisine>drink=new HashMap<String, Cuisine>();
		drink.put("014",new Drinks("��������",100,"src/image/014.jpg",7.5,"014"));
		drink.put("015",new Drinks("С��ѩ��",100,"src/image/015.jpg",5.5,"015"));
		drink.put("016",new Drinks("С�޿���",100,"src/image/016.jpg",5.5,"016"));
		drink.put("021",new Drinks("�ൺ����",100,"src/image/021.jpg",6.5,"021"));
		drink.put("020",new Drinks("���Ҭ��",100,"src/image/020.jpg",7.0,"020"));
		HashMap<String, Cuisine>meat=new HashMap<String, Cuisine>();
		meat.put("001",new Meet("��ƷϺ��",100,"src/image/001.jpg",32.5,"001"));
		meat.put("002",new Meet("��ƺ�",100,"src/image/002.jpg",23.0,"002"));
		meat.put("003",new Meet("�Ķ���",100,"src/image/003.jpg",25.0,"003"));
		meat.put("004",new Meet("��ѩ��ţ",100,"src/image/004.jpg",55.0,"004"));
		meat.put("005",new Meet("�ʻ��쳦",100,"src/image/005.jpg",32.5,"005"));
		meat.put("006",new Meet("��ë��",100,"src/image/006.jpg",45.5,"006"));
		
		HashMap<String, Cuisine>snack=new HashMap<String, Cuisine>();
		snack.put("007",new Snack("��������",100,"src/image/007.jpg",22.0,"007"));
		snack.put("008",new Snack("��ը����",100,"src/image/008.jpg",22.0,"008"));
		snack.put("011",new Snack("���Ǳ���",100,"src/image/011.jpg",5.0,"011"));
		snack.put("018",new Snack("Ҭ֭����",100,"src/image/018.jpg",12.0,"018"));
		snack.put("025",new Snack("�����׾�",100,"src/image/025.jpg",15.0,"025"));
		HashMap<String, Cuisine>vegetable=new HashMap<String, Cuisine>();
		vegetable.put("009",new Vegetable("��ը��Ƥ",100,"src/image/009.jpg",16.0,"009"));
		vegetable.put("010",new Vegetable("��Ƭ��",100,"src/image/010.jpg",22.0,"010"));
		vegetable.put("024",new Vegetable("������",100,"src/image/024.jpg",16.0,"024"));
		vegetable.put("023",new Vegetable("Ұ������",100,"src/image/023.jpg",25.0,"023"));
		vegetable.put("022",new Vegetable("����Ƭ",100,"src/image/022.jpg",22.0,"022"));
		
		put("pot_bottom", pot_bottom);
		put("meat", meat);
		put("vegetable", vegetable);
		put("snack", snack);
		put("drink", drink);//����Ʒ�ֿ����warehouse�����Ӳֿ���Ϊkey
		
	}
}

