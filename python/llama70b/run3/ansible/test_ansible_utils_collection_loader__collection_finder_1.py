import unittest
from ansible.utils.collection_loader import AnsibleCollectionRe


class TestAnsibleCollectionFinder(unittest.TestCase):
    def test___init__(self):
        instance = _collection_finder._AnsibleCollectionFinder(paths=['/path/to/ansible_collections'])
        self.assertIsNotNone(instance)

    def test__remove(self):
        instance = _collection_finder._AnsibleCollectionFinder(paths=['/path/to/ansible_collections'])
        instance._remove()
        self.assertIsNone(AnsibleCollectionConfig.collection_finder)

    def test__install(self):
        instance = _collection_finder._AnsibleCollectionFinder(paths=['/path/to/ansible_collections'])
        instance._install()
        self.assertIsNotNone(AnsibleCollectionConfig.collection_finder)

    def test__ansible_collection_path_hook(self):
        instance = _collection_finder._AnsibleCollectionFinder(paths=['/path/to/ansible_collections'])
        result = instance._ansible_collection_path_hook('/path/to/ansible_collections')
        self.assertIsInstance(result, _collection_finder._AnsiblePathHookFinder)

    def test__n_collection_paths(self):
        instance = _collection_finder._AnsibleCollectionFinder(paths=['/path/to/ansible_collections'])
        result = instance._n_collection_paths
        self.assertIsNotNone(result)

    def test_set_playbook_paths(self):
        instance = _collection_finder._AnsibleCollectionFinder(paths=['/path/to/ansible_collections'])
        instance.set_playbook_paths(['/path/to/playbook'])
        self.assertIsNotNone(instance._n_playbook_paths)

    def test__reload_hack(self):
        instance = _collection_finder._AnsibleCollectionFinder(paths=['/path/to/ansible_collections'])
        instance._reload_hack('ansible_collections')

    def test_find_module(self):
        instance = _collection_finder._AnsibleCollectionFinder(paths=['/path/to/ansible_collections'])
        result = instance.find_module('ansible_collections.my_collection')
        self.assertIsNotNone(result)

    def test___str__(self):
        instance = _collection_finder._AnsibleCollectionFinder(paths=['/path/to/ansible_collections'])
        result = str(instance)
        self.assertIsNotNone(result)

    def test___repr__(self):
        instance = _collection_finder._AnsibleCollectionFinder(paths=['/path/to/ansible_collections'])
        result = repr(instance)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()