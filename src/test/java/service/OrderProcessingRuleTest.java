package service;

import com.assessment.dto.Product;
import com.assessment.service.OrderProcessingRule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
 class OrderProcessingRuleTest {
  @InjectMocks
  OrderProcessingRule orderProcessingRule;
  @Test
  void test_book() {
    String[] type = {"book"};
    Product product = orderProcessingRule.convertInputToType(type);
    Assertions.assertEquals("Generate a commission payment to the agent",product.getOperations().get(0));
    Assertions.assertEquals("create a duplicate packing slip for the royalty department",product.getOperations().get(1));

  }

  @Test
  void test_membership() {
    String[] type = {"membership"};
    Product product = orderProcessingRule.convertInputToType(type);
    Assertions.assertEquals("activate that membership",product.getOperations().get(0));
    Assertions.assertEquals("e-mail the owner and inform them of the activation/upgrade",product.getOperations().get(1));
  }

  @Test
  void test_physical() {
    String[] type = {"physical_product"};
    Product product = orderProcessingRule.convertInputToType(type);
    Assertions.assertEquals("Generate a packing slip for shipping",product.getOperations().get(0));
    Assertions.assertEquals("Generate a commission payment to the agent",product.getOperations().get(1));
  }

  @Test
  void test_video() {
    String[] type = {"video"};
    Product product = orderProcessingRule.convertInputToType(type);
    Assertions.assertEquals("add a free “First Aid” video to the packing slip",product.getOperations().get(0));
  }

  @Test
  void test_other() {
    String[] type = {"other"};
    Product product = orderProcessingRule.convertInputToType(type);
    Assertions.assertEquals("Generate a packing slip for shipping",product.getOperations().get(0));
  }

  @Test
  void test_multiple() {
    String[] type = {"book","video"};
    Product product = orderProcessingRule.convertInputToType(type);
    Assertions.assertEquals("Generate a commission payment to the agent",product.getOperations().get(0));
    Assertions.assertEquals("create a duplicate packing slip for the royalty department",product.getOperations().get(1));
    Assertions.assertEquals("add a free “First Aid” video to the packing slip",product.getOperations().get(2));

  }
}
