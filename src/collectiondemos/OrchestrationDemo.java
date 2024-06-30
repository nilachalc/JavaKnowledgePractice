package collectiondemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class OrchestrationDemo {

	public static void main(String[] args) {
		
		Map<Integer, List<String>> masterMap = new HashMap<Integer, List<String>>();
		
		String[] firstSetOfApps = {"app8", "app9", "app10-orchestration", "app11-orchestration"}; 
		String[] secondSetOfApps = {"app4", "app5", "app6-orchestration", "app7"};
		String[] thirdSetOfApps = {"app-12", "app-13", "app-14"};
		String[] fourthSetOfApps = {"app1", "app2", "app3-orchestration"};
		String[] fifthSetOfApps = {"app-15", "app-16", "app-17", "app-18"};
		
		List<String> firstAppsList = Arrays.asList(firstSetOfApps);
		List<String> secondAppsList = Arrays.asList(secondSetOfApps);
		List<String> thirdAppsList = Arrays.asList(thirdSetOfApps);
		List<String> fourthdAppsList = Arrays.asList(fourthSetOfApps);
		List<String> fifthAppsList = Arrays.asList(fifthSetOfApps);
		
		List<Integer> properGearIds = new ArrayList<Integer>();
		List<Integer> failingGearIds = new ArrayList<Integer>();
		
		masterMap.put(1001, firstAppsList);
		masterMap.put(1002, secondAppsList);
		masterMap.put(1003, thirdAppsList);
		masterMap.put(1004, fourthdAppsList);
		masterMap.put(1005, fifthAppsList);
		
		for (Entry<Integer, List<String>> entry : masterMap.entrySet()) {
			List<String> apps = entry.getValue();
			Integer counter = 0;
			for (String app : apps) {
				if (app.contains("orchestration")) {
					counter++;
				}
			}
			if (counter >= 1) {
				properGearIds.add(entry.getKey());
			} else {
				failingGearIds.add(entry.getKey());
			}
		}
		
		System.out.println("The Proper Gear Ids are as follows:");
		for (Integer integer : properGearIds) {
			System.out.print(integer + "  ");
		}
		System.out.println();
		System.out.println("The failing Gear Ids are as follows:");
		for (Integer integer : failingGearIds) {
			System.out.print(integer + "  ");
		}
		
		properGearIds = masterMap.entrySet().stream()
                .filter(entry -> entry.getValue().stream().anyMatch(app -> app.contains("orchestration")))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        failingGearIds = masterMap.entrySet().stream()
                .filter(entry -> entry.getValue().stream().noneMatch(app -> app.contains("orchestration")))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
		
        System.out.println();
        System.out.println("The Proper Gear Ids are as follows:");
        properGearIds.forEach(t -> System.out.println(t));
        System.out.println("The failing Gear Ids are as follows:");
        failingGearIds.forEach(t -> System.out.println(t));
	}
}