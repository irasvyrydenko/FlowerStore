package com.ucu.edu.ua.lab8;

import com.ucu.edu.ua.lab8.controller.StrategyController;
import com.ucu.edu.ua.lab8.service.StrategyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StrategyController.class) // Тестуємо лише цей контролер
public class StrategyControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // Створюємо "мок" (імітацію) сервісу,
    // оскільки ми не хочемо тестувати логіку сервісу тут
    @MockBean
    private StrategyService strategyService;

    @Test
    public void testGetPaymentStrategies() throws Exception {
        // Навчаємо мок: "коли хтось викличе getPaymentStrategies, поверни це"
        when(strategyService.getPaymentStrategies())
                .thenReturn(List.of("PayPal", "CreditCard"));

        // Виконуємо HTTP GET запит і перевіряємо відповідь
        mockMvc.perform(get("/api/strategies/payment"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0]").value("PayPal"))
                .andExpect(jsonPath("$[1]").value("CreditCard"));
    }

    @Test
    public void testGetDeliveryStrategies() throws Exception {
        // Навчаємо мок
        when(strategyService.getDeliveryStrategies())
                .thenReturn(List.of("Post", "DHL"));

        // Виконуємо HTTP GET запит і перевіряємо відповідь
        mockMvc.perform(get("/api/strategies/delivery"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2))
                .andExpect(jsonPath("$[0]").value("Post"));
    }
}