package service;

import com.assessment.service.CalculateTotalOrderValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CalculateTotalOrderValueTest {

  @InjectMocks
  CalculateTotalOrderValue calculateCost;

  @Test
  void test_scenario1() {
    Assertions.assertEquals(100, calculateCost.totalCost(1, 1, 1, 0));
  }

  @Test
  void test_scenario2() {
    Assertions.assertEquals(370, calculateCost.totalCost(5, 5, 1, 0));
  }

  @Test
  void test_scenario3() {
    Assertions.assertEquals(280, calculateCost.totalCost(3, 5, 1, 1));
  }
}
