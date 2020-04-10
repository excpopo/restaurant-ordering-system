package datebase;

import java.util.ArrayList;
import java.util.HashMap;

public class Warehouse extends HashMap<String, HashMap<String, Cuisine>> {//²ËÆ·²Ö¿â
	
	public Warehouse(){
		HashMap<String, Cuisine>pot_bottom=new HashMap<String, Cuisine>();//¶¨ÒåkeyÎª²ËÆ·ID£¬valueÎª²ËÆ·µÄmap
		pot_bottom.put("013",new Pot_bottomC("Èı¹úÑİÒå",100,"src/image/013.jpg",68.0,"013"));
		pot_bottom.put("012",new Pot_bottomC("¾Å¹¬¸ñ",100,"src/image/012.jpg",68.0,"012"));
		pot_bottom.put("017",new Pot_bottomC("Ô§Ñì¹øµ×",100,"src/image/017.jpg",68.0,"017"));
		pot_bottom.put("019",new Pot_bottomC("Å£ÓÍºì¹ø",100,"src/image/019.jpg",68.0,"019"));

		
		HashMap<String, Cuisine>drink=new HashMap<String, Cuisine>();
		drink.put("014",new Drinks("°ÙÍş´¿Éú",100,"src/image/014.jpg",7.5,"014"));
		drink.put("015",new Drinks("Ğ¡¹ŞÑ©±Ì",100,"src/image/015.jpg",5.5,"015"));
		drink.put("016",new Drinks("Ğ¡¹Ş¿ÉÀÖ",100,"src/image/016.jpg",5.5,"016"));
		drink.put("021",new Drinks("Çàµº´¿Éú",100,"src/image/021.jpg",6.5,"021"));
		drink.put("020",new Drinks("´ó¹ŞÒ¬ÄÌ",100,"src/image/020.jpg",7.0,"020"));
		HashMap<String, Cuisine>meat=new HashMap<String, Cuisine>();
		meat.put("001",new Meet("¼«Æ·Ïº»¬",100,"src/image/001.jpg",32.5,"001"));
		meat.put("002",new Meet("Öí»Æºí",100,"src/image/002.jpg",23.0,"002"));
		meat.put("003",new Meet("ºÄ¶ùÓã",100,"src/image/003.jpg",25.0,"003"));
		meat.put("004",new Meet("±ùÑ©·ÊÅ£",100,"src/image/004.jpg",55.0,"004"));
		meat.put("005",new Meet("ÏÊ»¬¶ì³¦",100,"src/image/005.jpg",32.5,"005"));
		meat.put("006",new Meet("ÏÊÃ«¶Ç",100,"src/image/006.jpg",45.5,"006"));
		
		HashMap<String, Cuisine>snack=new HashMap<String, Cuisine>();
		snack.put("007",new Snack("ºìÌÇôÙôÎ",100,"src/image/007.jpg",22.0,"007"));
		snack.put("008",new Snack("ÓÍÕ¨ËÖÈâ",100,"src/image/008.jpg",22.0,"008"));
		snack.put("011",new Snack("ºìÌÇ±ù·Û",100,"src/image/011.jpg",5.0,"011"));
		snack.put("018",new Snack("Ò¬Ö­Î÷Ã×",100,"src/image/018.jpg",12.0,"018"));
		snack.put("025",new Snack("ºìÌÇÃ×¾Æ",100,"src/image/025.jpg",15.0,"025"));
		HashMap<String, Cuisine>vegetable=new HashMap<String, Cuisine>();
		vegetable.put("009",new Vegetable("ÓÍÕ¨¸¯Æ¤",100,"src/image/009.jpg",16.0,"009"));
		vegetable.put("010",new Vegetable("ËñÆ¬Íõ",100,"src/image/010.jpg",22.0,"010"));
		vegetable.put("024",new Vegetable("ÌÆÉú²Ë",100,"src/image/024.jpg",16.0,"024"));
		vegetable.put("023",new Vegetable("Ò°ÉúÜíİï",100,"src/image/023.jpg",25.0,"023"));
		vegetable.put("022",new Vegetable("ÍÁ¶¹Æ¬",100,"src/image/022.jpg",22.0,"022"));
		
		put("pot_bottom", pot_bottom);
		put("meat", meat);
		put("vegetable", vegetable);
		put("snack", snack);
		put("drink", drink);//½«ÒûÆ·²Ö¿â¼ÓÈëwarehouse£¬ÒÔ×Ó²Ö¿âÃûÎªkey
		
	}
}

