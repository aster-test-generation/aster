import unittest
from ansible.modules.getent import *



class TestGetent(unittest.TestCase):
    def test_main(self):
        instance = Getent()
        result = instance.main()
        self.assertEqual(result, None)

    def test_get_database_value(self):
        instance = Getent()
        result = instance.get_database_value()
        self.assertEqual(result, None)

    def test_get_database_value_split(self):
        instance = Getent()
        result = instance.get_database_value_split()
        self.assertEqual(result, None)

    def test_get_database_value_key(self):
        instance = Getent()
        result = instance.get_database_value_key()
        self.assertEqual(result, None)

    def test_get_database_value_key_split(self):
        instance = Getent()
        result = instance.get_database_value_key_split()
        self.assertEqual(result, None)

    def test_get_database_value_key_split_service(self):
        instance = Getent()
        result = instance.get_database_value_key_split_service()
        self.assertEqual(result, None)

    def test_get_database_value_key_split_service_fail_key(self):
        instance = Getent()
        result = instance.get_database_value_key_split_service_fail_key()
        self.assertEqual(result, None)

    def test_get_database_value_key_split_service_fail_key_split(self):
        instance = Getent()
        result = instance.get_database_value_key_split_service_fail_key_split()
        self.assertEqual(result, None)

    def test_get_database_value_key_split_service_fail_key_split_colon(self):
        instance = Getent()
        result = instance.get_database_value_key_split_service_fail_key_split_colon()
        self.assertEqual(result, None)

    def test_get_database_value_key_split_service_fail_key_split_colon_seen(self):
        instance = Getent()
        result = instance.get_database_value_key_split_service_fail_key_split_colon_seen()
        self.assertEqual(result, None)

    def test_get_database_value_key_split_service_fail_key_split_colon_seen_record(self):
        instance = Getent()
        result = instance.get_database_value_key_split_service_fail_key_split_colon_seen_record()
        self.assertEqual(result, None)

    def test_get_database_value_key_split_service_fail_key_split_colon_seen_record_record_0(self):
        instance = Getent()
        result = instance.get_database_value_key_split_service_fail_key_split_colon_seen_record_record_0()
        self.assertEqual(result, None)

    def test_get_database_value_key_split_service_fail_key_split_colon_seen_record_record_0_record_1(self):
        instance = Getent()
        result = instance.get_database_value_key_split_service_fail_key_split_colon_seen_record_record_0_record_1()
        self.assertEqual(result, None)

    def test_get_database_value_key_split_service_fail_key_split_colon_seen_record_record_0_record_1_record_2(self):
        instance = Getent()
        result = instance.get_database_value_key_split_service_fail_key_split_colon_seen_record_record_0_record_1_record_2()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()