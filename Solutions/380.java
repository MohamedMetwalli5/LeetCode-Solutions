class RandomizedSet {
  private Map<Integer, Integer> valueToIndex = new HashMap<>();
  private List<Integer> valuesList = new ArrayList<>();
  private Random rand = new Random();

  private int getLastFromList(List<Integer> valuesList) {
    return valuesList.get(valuesList.size()-1);
  }

  public boolean insert(int val) {
    if(valueToIndex.containsKey(val)){
      return false;
    }
    valueToIndex.put(val, valuesList.size());
    valuesList.add(val);
    return true;
  }

  public boolean remove(int val) {
    if(!valueToIndex.containsKey(val)){
      return false;
    }
    int index = valueToIndex.get(val);
    valueToIndex.put(getLastFromList(valuesList), index);
    valuesList.set(index, getLastFromList(valuesList));
    valueToIndex.remove(val);
    valuesList.remove(valuesList.size()-1);
    return true;
  }

  public int getRandom() {
    final int index = rand.nextInt(valuesList.size());
    return valuesList.get(index);
  }

}
