import sys
import unittest
from pytutils.lazy.simple_import import _LazyModuleMarker, NonLocal, make_lazy


class TestLazyImport(unittest.TestCase):
    def test_lazy_module_marker(self):
        self.assertTrue(issubclass(_LazyModuleMarker, object))

    def test_nonlocal(self):
        nonlocal_obj = NonLocal(10)
        self.assertEqual(nonlocal_obj.value, 10)

    def test_make_lazy(self):
        module_path = 'example_module'
        make_lazy(module_path)
        self.assertIn(module_path, sys.modules)
        self.assertIsInstance(sys.modules[module_path], _LazyModuleMarker)

if __name__ == '__main__':
    unittest.main()