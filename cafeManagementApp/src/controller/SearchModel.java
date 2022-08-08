package controller;

import java.util.ArrayList;
import model.CafeMenu;
import model.Clients;




public class SearchModel {
	private static SearchModel instance = new SearchModel();

	
	/** 카페 메뉴를 저장하는 배열 */
	private ArrayList <CafeMenu> cafeMenuList = new ArrayList <CafeMenu>();
	

	/** 카페 메뉴 총 개수 */
	

	private SearchModel() {}

	public static SearchModel getInstance() {
		return instance;
		
	}
	

	/**
	 * 모든 메뉴 검색
	 * 
	 * @return 모든 MenuList
	 */
	public ArrayList <CafeMenu> getCafeMenuList() {
		return cafeMenuList;
		
	}

	
	/** 
	 * 메뉴 이름으로 검색 - 객체된 메뉴 반환하기
	 * 
	 * @param 메뉴 이름
	 * @return Cafe Menu 검색된 프로젝트 
	 */
	public CafeMenu getCafeMenu(String menuName) {
		
		for(CafeMenu menu : cafeMenuList) {
			if(menu.getMenuName().equals(menuName)) {
				return menu;
			}
		}
		
		return null;
	}
	

	/**
	 * 새로운 메뉴 추가 
	 * 
	 * @param Menu 저장하고자 하는 새로운 메뉴
	 */
	public void cafeMenuInsert(CafeMenu menu) {
		cafeMenuList.add(menu);   
		
	}

	
	/**
	 * Menu의 Price 수정 - 메뉴명으로 검색해서 해당 메뉴의 가격 수정
	 * 
	 * @param menuName 메뉴 이름
	 * @param price 가격  
	 */
	public void cafeMenuUpdate(String menuName, int menuPrice) {
		
		for (CafeMenu menu : cafeMenuList) {
			
			if (menu.getMenuName().equals(menuName)) {
				menu.setMenuPrice(menuPrice);
				break;
			}
		}
	}
	

	/**
	 * Menu 삭제 - 메뉴명으로 해당 메뉴 삭제
	 * 
	 * @param cafeMenuName 삭제하고자 하는 메뉴 이름
	 */
	public void cafeMenuDelete(String menuName) {
		
		for(CafeMenu menu : cafeMenuList) {
			if(menu.getMenuName().equals(menuName)) {
				cafeMenuList.remove(menu);
             
				break;
			}
		}
	}
			

	
	/**
	 * cafeMenu 총 개수 반환
	 * @return 개수
	 */
	public int menuListSize() {
		return cafeMenuList.size();
	}
	
	 public static Clients CheckClientsID(String clientID) {
	      // file reader를 통해 회원정보가 들어있는 배열 가져온다 가정 -> ArrayList<Clients>
	      ArrayList<Clients> clientsInfo = new ArrayList<Clients>();
	      Clients TempClient = null;

	      for (Clients client : clientsInfo) {
	         if (client.getClientID().equals(clientID)) {
	            TempClient = client;
	         }
	      }
	      return TempClient; // 해당 아이디를 가진 회원이 존재하지 않는 경우 null 값 반환
	   }


}
