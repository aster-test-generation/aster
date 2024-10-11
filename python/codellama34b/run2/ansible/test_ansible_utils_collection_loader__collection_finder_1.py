import unittest
from ansible.utils.collection_loader import AnsibleCollectionRef



class Test_AnsibleCollectionFinder(unittest.TestCase):
    def test___init__(self):
        instance = _AnsibleCollectionFinder()
        self.assertEqual(instance._ansible_pkg_path, to_native(os.path.dirname(to_bytes(sys.modules['ansible'].__file__))))
        self.assertEqual(instance._n_configured_paths, [])
        self.assertEqual(instance._n_cached_collection_paths, None)
        self.assertEqual(instance._n_cached_collection_qualified_paths, None)
        self.assertEqual(instance._n_playbook_paths, [])

    def test___init__2(self):
        instance = _AnsibleCollectionFinder(paths=['path1', 'path2'], scan_sys_paths=True)
        self.assertEqual(instance._ansible_pkg_path, to_native(os.path.dirname(to_bytes(sys.modules['ansible'].__file__))))
        self.assertEqual(instance._n_configured_paths, ['path1', 'path2'])
        self.assertEqual(instance._n_cached_collection_paths, None)
        self.assertEqual(instance._n_cached_collection_qualified_paths, None)
        self.assertEqual(instance._n_playbook_paths, [])

    def test___init__3(self):
        instance = _AnsibleCollectionFinder(paths=['path1', 'path2'], scan_sys_paths=False)
        self.assertEqual(instance._ansible_pkg_path, to_native(os.path.dirname(to_bytes(sys.modules['ansible'].__file__))))
        self.assertEqual(instance._n_configured_paths, ['path1', 'path2'])
        self.assertEqual(instance._n_cached_collection_paths, None)
        self.assertEqual(instance._n_cached_collection_qualified_paths, None)
        self.assertEqual(instance._n_playbook_paths, [])

    def test___init__4(self):
        instance = _AnsibleCollectionFinder(paths='path1', scan_sys_paths=True)
        self.assertEqual(instance._ansible_pkg_path, to_native(os.path.dirname(to_bytes(sys.modules['ansible'].__file__))))
        self.assertEqual(instance._n_configured_paths, ['path1'])
        self.assertEqual(instance._n_cached_collection_paths, None)
        self.assertEqual(instance._n_cached_collection_qualified_paths, None)
        self.assertEqual(instance._n_playbook_paths, [])

    def test___init__5(self):
        instance = _AnsibleCollectionFinder(paths='path1', scan_sys_paths=False)
        self.assertEqual(instance._ansible_pkg_path, to_native(os.path.dirname(to_bytes(sys.modules['ansible'].__file__))))
        self.assertEqual(instance._n_configured_paths, ['path1'])
        self.assertEqual(instance._n_cached_collection_paths, None)
        self.assertEqual(instance._n_cached_collection_qualified_paths, None)
        self.assertEqual(instance._n_playbook_paths, [])

    def test___init__6(self):
        instance = _AnsibleCollectionFinder(paths=None, scan_sys_paths=True)
        self.assertEqual(instance._ansible_pkg_path, to_native(os.path.dirname(to_bytes(sys.modules['ansible'].__file__))))
        self.assertEqual(instance._n_configured_paths, [])
        self.assertEqual(instance._n_cached_collection_paths, None)
        self.assertEqual(instance._n_cached_collection_qualified_paths, None)
        self.assertEqual(instance._n_playbook_paths, [])

if __name__ == '__main__':
    unittest.main()