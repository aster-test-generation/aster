import sys
import unittest
from pytutils.lazy.simple_import import _LazyModuleMarker, NonLocal, make_lazy


class TestLazyModuleMarker(unittest.TestCase):
    def test_lazy_module_marker(self):
        instance = _LazyModuleMarker()
        self.assertIsInstance(instance, _LazyModuleMarker)

class TestNonLocal(unittest.TestCase):
    def test_non_local(self):
        instance = NonLocal(1)
        self.assertIsInstance(instance, NonLocal)
        self.assertEqual(instance.value, 1)

class TestMakeLazy(unittest.TestCase):
    def test_make_lazy(self):
        make_lazy('os')
        self.assertIn('os', sys.modules)
        self.assertIsInstance(sys.modules['os'], _LazyModuleMarker)

if __name__ == '__main__':
    unittest.main()