package com.assessment.service;

import java.util.List;

public interface PhysicalProduct {

  List<String> getSlip(List<String> operations);

  List<String> addCommission(List<String> operations);

  List<String> duplicateSlip(List<String> operations);

  List<String> activateMembership(List<String> operations);

  List<String> upgradeMembership(List<String> operations);

  List<String> emailMembership(List<String> operations);

  List<String> video(List<String> operations);
}
