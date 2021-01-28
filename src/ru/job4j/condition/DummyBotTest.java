package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.assertThat;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        assertThat(
                DummyBot.answer("привет бот"),
                is("привет умник")
        );
    }

    @Test
    public void whenByeBot() {
        assertThat(
                DummyBot.answer("пока бот"),
                is("до скорой встречи")
        );
    }

    @Test
    public void whenUnKnownBot() {
        assertThat(
                DummyBot.answer("как сам бот"),
                is("Это ставит меня в тупик. Задайте другой вопрос")
        );
    }

}
