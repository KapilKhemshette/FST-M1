import time

from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/tables")
    print("Title of the page: " +driver.title)

    rows = driver.find_elements(By.XPATH, "//table/tbody/tr")
    print("No. of rows are : " + str(len(rows)))

    columns = driver.find_elements(By.XPATH, "//table/tbody/tr[1]/td")
    print("No. of rows are : " + str(len(columns)))

    fifth_row_book_name = driver.find_element(By.XPATH, "//table/tbody/tr[5]/td[2]").text
    print("FifthRow Book Name : " + fifth_row_book_name)

    driver.find_element(By.XPATH, "//table/thead/tr/th[5]").click()

    fifth_row_book_name_after_sorting = driver.find_element(By.XPATH, "//table/tbody/tr[5]/td[2]").text
    print("FifthRow Book Name after sorting : " + fifth_row_book_name_after_sorting)

    driver.close()