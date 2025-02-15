from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:

    driver.get("https://training-support.net/webelements/drag-drop")

    print("Title of the page " + driver.title)

    actions = webdriver.ActionChains(driver)
    football = driver.find_element(By.XPATH, "//*[@alt = 'A Football']")
    dropzone1 = driver.find_element(By.XPATH, "//*[@id = 'dropzone1']")
    dropzone2 = driver.find_element(By.XPATH, "//*[@id = 'dropzone2']")
    dropZone1Text = driver.find_element(By.XPATH, "//*[text() = 'Dropzone1']").text
    dropZone2Text = driver.find_element(By.XPATH, "//*[text() = 'Dropzone2']").text

    actions.click_and_hold(football).move_to_element(dropzone1).release().pause(2).perform()
    assert dropZone1Text !=dropzone1
    print("Dropzone1 is changed to " + dropzone1.text+ " Ball is dropped in Dropzone1")

    actions.drag_and_drop(football, dropzone2).pause(2).perform()
    assert dropZone2Text != dropzone2
    print("Dropzone2 is changed to " + dropzone2.text + " Ball is dropped in Dropzone2")

    driver.close()