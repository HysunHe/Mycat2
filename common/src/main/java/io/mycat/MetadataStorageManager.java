package io.mycat;

import java.util.Set;

public abstract class MetadataStorageManager {
  abstract   void start();

  public abstract void reportReplica(String name, Set<String> dsNames);
}