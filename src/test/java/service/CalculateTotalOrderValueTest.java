package service;

import com.assessment.service.CalculateTotalOrderValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class CalculateTotalOrderValueTest {

  @InjectMocks
  CalculateTotalOrderValue calculateTotalOrderValue;

  @Test
  void test_scenario1() {
    List<Integer> cartItems = new ArrayList<>();
    cartItems.add(1);
    cartItems.add(1);
    cartItems.add(1);
    cartItems.add(0);
    Assertions.assertEquals(100, calculateTotalOrderValue.totalCost(cartItems));
  }

  @Test
  void test_scenario2() {
    List<Integer> cartItems = new ArrayList<>();
    cartItems.add(5);
    cartItems.add(5);
    cartItems.add(1);
    cartItems.add(0);
    Assertions.assertEquals(370, calculateTotalOrderValue.totalCost(cartItems));
  }

  @Test
  void test_scenario3() {
    List<Integer> cartItems = new ArrayList<>();
    cartItems.add(3);
    cartItems.add(5);
    cartItems.add(1);
    cartItems.add(1);
    Assertions.assertEquals(280, calculateTotalOrderValue.totalCost(cartItems));
  }
}
