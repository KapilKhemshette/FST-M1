import time

from selenium import webdriver
from selenium.webdriver.common.by import By


def get_message():
    message = driver.find_element(By.TAG_NAME, "p").text
    return message

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/mouse-events")

    print("Title of the page is "+driver.title)

    actions = webdriver.ActionChains(driver)

    cargo_lock = driver.find_element(By.XPATH , "//h1[text() = 'Cargo.lock']")
    actions.click(cargo_lock).pause(2).perform()
    print("Message after left click on cargo lock -"+ get_message())

    cargo_toml = driver.find_element(By.XPATH , "//h1[text() = 'Cargo.toml']")
    actions.move_to_element(cargo_toml).pause(2).click(cargo_toml).pause(2).perform()
    print("Message after click on cargo toml -" + get_message())

    src = driver.find_element(By.XPATH, "//h1[text() = 'src']")
    actions.double_click(src).pause(2).perform()
    print("Message double click on src -" + get_message())

    target = driver.find_element(By.XPATH, "//h1[text() = 'target']")
    actions.context_click(target).pause(2).perform()
    driver.find_element(By.XPATH, "//*[text()= 'Open']").click()
    time.sleep(2)
    print("Message after right click on target and select open from list -" + get_message())

    driver.close()



