import unittest
from youtube_dl.aes import aes_cbc_decrypt



class TestKeyScheduleCore(unittest.TestCase):
    def test_key_schedule_core(self):
        data = [1, 2, 3, 4]
        rcon_iteration = 1
        result = key_schedule_core(data, rcon_iteration)
        self.assertEqual(result, [2, 3, 4, 1])

    def test_key_schedule_core_2(self):
        data = [1, 2, 3, 4]
        rcon_iteration = 2
        result = key_schedule_core(data, rcon_iteration)
        self.assertEqual(result, [3, 4, 1, 2])

    def test_key_schedule_core_3(self):
        data = [1, 2, 3, 4]
        rcon_iteration = 3
        result = key_schedule_core(data, rcon_iteration)
        self.assertEqual(result, [4, 1, 2, 3])

    def test_key_schedule_core_4(self):
        data = [1, 2, 3, 4]
        rcon_iteration = 4
        result = key_schedule_core(data, rcon_iteration)
        self.assertEqual(result, [1, 2, 3, 4])

    def test_key_schedule_core_5(self):
        data = [1, 2, 3, 4]
        rcon_iteration = 5
        result = key_schedule_core(data, rcon_iteration)
        self.assertEqual(result, [2, 3, 4, 1])

    def test_key_schedule_core_6(self):
        data = [1, 2, 3, 4]
        rcon_iteration = 6
        result = key_schedule_core(data, rcon_iteration)
        self.assertEqual(result, [3, 4, 1, 2])

    def test_key_schedule_core_7(self):
        data = [1, 2, 3, 4]
        rcon_iteration = 7
        result = key_schedule_core(data, rcon_iteration)
        self.assertEqual(result, [4, 1, 2, 3])

    def test_key_schedule_core_8(self):
        data = [1, 2, 3, 4]
        rcon_iteration = 8
        result = key_schedule_core(data, rcon_iteration)
        self.assertEqual(result, [1, 2, 3, 4])

    def test_key_schedule_core_9(self):
        data = [1, 2, 3, 4]
        rcon_iteration = 9
        result = key_schedule_core(data, rcon_iteration)
        self.assertEqual(result, [2, 3, 4, 1])

    def test_key_schedule_core_10(self):
        data = [1, 2, 3, 4]
        rcon_iteration = 10
        result = key_schedule_core(data, rcon_iteration)
        self.assertEqual(result, [3, 4, 1, 2])

    def test_key_schedule_core_11(self):
        data = [1, 2, 3, 4]
        rcon_iteration = 11
        result = key_schedule_core(data, rcon_iteration)
        self.assertEqual(result, [4, 1, 2, 3])

if __name__ == '__main__':
    unittest.main()