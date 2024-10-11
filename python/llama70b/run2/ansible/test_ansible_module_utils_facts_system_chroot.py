import os
import unittest
from ansible.module_utils.facts.system.chroot import ChrootFactCollector, is_chroot


class TestChrootFactCollector(unittest.TestCase):
    def test_init(self):
        instance = ChrootFactCollector()
        self.assertIsInstance(instance, ChrootFactCollector)

    def test_name(self):
        instance = ChrootFactCollector()
        self.assertEqual(instance.name, 'chroot')

    def test_fact_ids(self):
        instance = ChrootFactCollector()
        self.assertEqual(instance._fact_ids, set(['is_chroot']))

    def test_collect(self):
        instance = ChrootFactCollector()
        result = instance.collect()
        self.assertIn('is_chroot', result)

    def test_private___init__(self):
        instance = ChrootFactCollector()
        self.assertIsInstance(instance, ChrootFactCollector)

    def test_private___str__(self):
        instance = ChrootFactCollector()
        result = instance.__str__()
        self.assertEqual(result, 'ChrootFactCollector')

    def test_private___repr__(self):
        instance = ChrootFactCollector()
        result = instance.__repr__()
        self.assertEqual(result, 'ChrootFactCollector()')

class TestIsChrootFunction(unittest.TestCase):
    def test_is_chroot_debian_chroot(self):
        os.environ['debian_chroot'] = 'True'
        result = is_chroot()
        self.assertTrue(result)

    def test_is_chroot_stat(self):
        result = is_chroot()
        self.assertIsInstance(result, bool)

    def test_is_chroot_exception(self):
        with unittest.mock.patch('os.stat', side_effect=Exception):
            result = is_chroot()
            self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()