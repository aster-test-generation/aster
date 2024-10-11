import unittest
from ansible.module_utils.compat.version import *

class TestVersion(unittest.TestCase):
    def test_version(self):
        instance = Version()
        self.assertEqual(instance.__repr__(), "Version ('')")
        self.assertEqual(instance.__str__(), '')
        self.assertEqual(instance.__eq__(StrictVersion('1.2.3')), False)
        self.assertEqual(instance.__lt__(StrictVersion('1.2.3')), True)
        self.assertEqual(instance.__le__(StrictVersion('1.2.3')), True)
        self.assertEqual(instance.__gt__(StrictVersion('1.2.3')), False)
        self.assertEqual(instance.__ge__(StrictVersion('1.2.3')), False)

    def test_strict_version(self):
        instance = StrictVersion('1.2.3')
        self.assertEqual(instance.__repr__(), "StrictVersion ('1.2.3')")
        self.assertEqual(instance.__str__(), '1.2.3')
        self.assertEqual(instance.__eq__(StrictVersion('1.2.3')), True)
        self.assertEqual(instance.__lt__(StrictVersion('1.2.3')), False)
        self.assertEqual(instance.__le__(StrictVersion('1.2.3')), True)
        self.assertEqual(instance.__gt__(StrictVersion('1.2.3')), False)
        self.assertEqual(instance.__ge__(StrictVersion('1.2.3')), True)

    def test_loose_version(self):
        instance = LooseVersion('1.2.3')
        self.assertEqual(instance.__repr__(), "LooseVersion ('1.2.3')")
        self.assertEqual(instance.__str__(), '1.2.3')
        self.assertEqual(instance.__eq__(LooseVersion('1.2.3')), True)
        self.assertEqual(instance.__lt__(LooseVersion('1.2.3')), False)
        self.assertEqual(instance.__le__(LooseVersion('1.2.3')), True)
        self.assertEqual(instance.__gt__(LooseVersion('1.2.3')), False)
        self.assertEqual(instance.__ge__(LooseVersion('1.2.3')), True)

if __name__ == '__main__':
    unittest.main()