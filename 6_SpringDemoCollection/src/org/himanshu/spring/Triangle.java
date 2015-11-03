package org.himanshu.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Triangle {
	
	private List<Point> points;
	private Map<String,String> map;
	private Set<String> set;

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	public void draw(){
		for(Point point : points){
			System.out.println("Point : (" + point.getX()+ ","+ point.getY()+ ")");
		}
		for(String key:map.keySet()){
			System.out.println("Map entry: key= "+ key + " value: "+ map.get(key) );
		}
		for(String val:set){
			System.out.println("Set value: "+ val);
		}
		
	}

}
