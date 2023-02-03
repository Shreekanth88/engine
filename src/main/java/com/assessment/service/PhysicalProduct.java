package com.assessment.service;

import java.util.List;

public class PhysicalProduct {

  public List<String> getSlip(List<String> operations)
  {
    operations.add("Generate a packing slip for shipping");
    return operations;
  }
  public List<String> addCommission(List<String> operations)
  {
    operations.add("Generate a commission payment to the agent");
    return operations;
  }

  public List<String> duplicateSlip(List<String> operations) {
    operations.add("create a duplicate packing slip for the royalty department");
    return operations;
  }

  public List<String> activateMembership(List<String> operations) {
    operations.add("activate that membership");
    return operations;
  }
  public List<String> upgradeMembership(List<String> operations) {
    operations.add("apply the upgrade");
    return operations;
  }
  public List<String> emailMembership(List<String> operations) {
    operations.add("e-mail the owner and inform them of the activation/upgrade");
    return operations;
  }
  public List<String> video(List<String> operations) {
    operations.add("add a free “First Aid” video to the packing slip");
    return operations;
  }
}
