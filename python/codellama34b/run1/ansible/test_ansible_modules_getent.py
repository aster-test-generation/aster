import unittest
from ansible.modules.getent import *



class TestGetent(unittest.TestCase):
    def test_main(self):
        instance = Getent
        result = instance.main()
        self.assertEqual(result, None)

    def test_get_database_value(self):
        instance = getent.Getent()
        result = instance.get_database_value()
        self.assertEqual(result, None)

    def test_get_database_value_fail(self):
        instance = Getent
        result = instance.get_database_value_fail()
        self.assertEqual(result, None)

    def test_get_database_value_fail_key(self):
        instance = Getent
        result = instance.get_database_value_fail_key()
        self.assertEqual(result, None)

    def test_get_database_value_fail_key_false(self):
        instance = Getent()
        result = instance.get_database_value_fail_key_false()
        self.assertEqual(result, None)

    def test_get_database_value_fail_key_true(self):
        instance = Getent
        result = instance.get_database_value_fail_key_true()
        self.assertEqual(result, None)

    def test_get_database_value_fail_split(self):
        instance = Getent()
        result = instance.get_database_value_fail_split()
        self.assertEqual(result, None)

    def test_get_database_value_fail_split_colon(self):
        instance = Getent
        result = instance.get_database_value_fail_split_colon()
        self.assertEqual(result, None)

    def test_get_database_value_fail_split_none(self):
        instance = Getent
        result = instance.get_database_value_fail_split_none()
        self.assertEqual(result, None)

    def test_get_database_value_fail_split_split(self):
        instance = Getent
        result = instance.get_database_value_fail_split_split()
        self.assertEqual(result, None)

    def test_get_database_value_fail_split_split_colon(self):
        instance = Getent
        result = instance.get_database_value_fail_split_split_colon()
        self.assertEqual(result, None)

    def test_get_database_value_fail_split_split_none(self):
        instance = Getent()
        result = instance.get_database_value_fail_split_split_none()
        self.assertEqual(result, None)

    def test_get_database_value_fail_split_split_split(self):
        instance = getent.Getent()
        result = instance.get_database_value_fail_split_split_split()
        self.assertEqual(result, None)

    def test_get_database_value_fail_split_split_split_colon(self):
        instance = Getent
        result = instance.get_database_value_fail_split_split_split_colon()
        self.assertEqual(result, None)

    def test_get_database_value_fail_split_split_split_none(self):
        instance = getent.Getent()
        result = instance.get_database_value_fail_split_split_split_none()
        self.assertEqual(result, None)

    def test_get_database_value_fail_split_split_split_split(self):
        instance = getent.Getent()
        result = instance.get_database_value_fail_split_split_split_split()
        self.assertEqual(result, None)

    def test_get_database_value_fail_split_split_split_split_colon(self):
        instance = Getent()
        result = instance.get_database_value_fail_split_split_split_split_colon()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()