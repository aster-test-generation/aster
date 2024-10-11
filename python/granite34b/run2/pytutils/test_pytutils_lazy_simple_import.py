import sys
import unittest
from pytutils.lazy.simple_import import _LazyModuleMarker, NonLocal, make_lazy


class TestLazyImport(unittest.TestCase):
    def test_lazy_module_marker(self):
        self.assertTrue(issubclass(_LazyModuleMarker, object))

    def test_non_local(self):
        non_local = NonLocal(1)
        self.assertEqual(non_local.value, 1)

    def test_make_lazy(self):
        module_path = "example_module"
        make_lazy(module_path)
        self.assertTrue(module_path in sys.modules)
        self.assertTrue(isinstance(sys.modules[module_path], _LazyModuleMarker))

if __name__ == '__main__':
    unittest.main()