import unittest
from ansible.module_utils.facts.network.hurd import *


class TestHurdPfinetNetwork(unittest.TestCase):
    def test_assign_network_facts(self):
        instance = HurdPfinetNetwork(module)
        network_facts = {}
        fsysopts_path = instance.module.get_bin_path('fsysopts')
        socket_path = None
        for l in ('inet', 'inet6'):
            link = os.path.join(instance._socket_dir, l)
            if os.path.exists(link):
                socket_path = link
                break
        result = instance.assign_network_facts(network_facts, fsysopts_path, socket_path)
        self.assertEqual(result, network_facts)

    def test_populate(self):
        instance = HurdPfinetNetwork(module)
        collected_facts = None
        result = instance.populate(collected_facts)
        self.assertEqual(result, {})

class TestHurdNetworkCollector(unittest.TestCase):
    def test_populate(self):
        instance = HurdNetworkCollector()
        collected_facts = None
        result = instance.populate_facts(collected_facts)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()