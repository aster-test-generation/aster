import unittest
from pymonet.monad_try import Try

class TestTry(unittest.TestCase):
    def test_init(self):
        try_instance = Try(1, True)
        self.assertEqual(try_instance.value, 1)
        self.assertEqual(try_instance.is_success, True)

    def test_eq(self):
        try_instance_1 = Try(1, True)
        try_instance_2 = Try(1, True)
        try_instance_3 = Try(2, True)
        try_instance_4 = Try(1, False)
        self.assertEqual(try_instance_1, try_instance_2)
        self.assertNotEqual(try_instance_1, try_instance_3)
        self.assertNotEqual(try_instance_1, try_instance_4)

    def test_str(self):
        try_instance = Try(1, True)
        self.assertEqual(str(try_instance), 'Try[value=1, is_success=True]')

    def test_of(self):
        try_instance_1 = Try.of(lambda x: x + 1, 1)
        self.assertEqual(try_instance_1.value, 2)
        self.assertEqual(try_instance_1.is_success, True)
        try_instance_2 = Try.of(lambda x: x + 1, 'error')
        self.assertEqual(try_instance_2.value, 'error')
        self.assertEqual(try_instance_2.is_success, False)

    def test_map(self):
        try_instance_1 = Try.of(lambda x: x + 1, 1).map(lambda x: x * 2)
        self.assertEqual(try_instance_1.value, 4)
        self.assertEqual(try_instance_1.is_success, True)
        try_instance_2 = Try.of(lambda x: x + 1, 'error').map(lambda x: x * 2)
        self.assertEqual(try_instance_2.value, 'error')
        self.assertEqual(try_instance_2.is_success, False)

    def test_bind(self):
        try_instance_1 = Try.of(lambda x: x + 1, 1).bind(lambda x: Try.of(lambda y: y * 2, x))
        self.assertEqual(try_instance_1.value, 4)
        self.assertEqual(try_instance_1.is_success, True)
        try_instance_2 = Try.of(lambda x: x + 1, 'error').bind(lambda x: Try.of(lambda y: y * 2, x))
        self.assertEqual(try_instance_2.value, 'error')
        self.assertEqual(try_instance_2.is_success, False)

    def test_on_success(self):
        try_instance_1 = Try.of(lambda x: x + 1, 1).on_success(lambda x: print(f'Success: {x}'))
        self.assertEqual(try_instance_1.value, 1)
        self.assertEqual(try_instance_1.is_success, True)
        try_instance_2 = Try.of(lambda x: x + 1, 'error').on_success(lambda x: print(f'Success: {x}'))
        self.assertEqual(try_instance_2.value, 'error')
        self.assertEqual(try_instance_2.is_success, False)

    def test_on_fail(self):
        try_instance_1 = Try.of(lambda x: x + 1, 1).on_fail(lambda x: print(f'Failure: {x}'))
        self.assertEqual(try_instance_1.value, 1)
        self.assertEqual(try_instance_1.is_success, True)
        try_instance_2 = Try.of(lambda x: x + 1, 'error').on_fail(lambda x: print(f'Failure: {x}'))
        self.assertEqual(try_instance_2.value, 'error')
        self.assertEqual(try_instance_2.is_success, False)

if __name__ == '__main__':
    unittest.main()