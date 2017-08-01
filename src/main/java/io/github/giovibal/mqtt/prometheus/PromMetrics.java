package io.github.giovibal.mqtt.prometheus;

import io.prometheus.client.Counter;

/**
 * Created by giovanni on 07/07/17.
 */
public class PromMetrics {
    public static final Counter mqtt_publish_total =
            Counter.build().name("mqtt_publish_total").help("Total mqtt publish messages.")
                    .labelNames("qos","topic")
                    .register();

    public static final Counter mqtt_subscribe_total =
            Counter.build().name("mqtt_subscribe_total").help("Total mqtt subscribe messages.")
                    .labelNames("qos", "topic_filter")
                    .register();

    public static final Counter mqtt_subscriptions_total =
            Counter.build().name("mqtt_subscriptions_total").help("Total mqtt subscriptions.")
                    .labelNames("qos","topic_filter")
                    .register();

    public static final Counter mqtt_unsubscribe_total =
            Counter.build().name("mqtt_unsubscribe_total").help("Total mqtt unsubscribe messages.")
                    .labelNames("topic_filter")
                    .register();

    public static final Counter mqtt_connect_total =
            Counter.build().name("mqtt_connect_total").help("Total mqtt connect messages.")
                    .register();

    public static final Counter mqtt_disconnect_total =
            Counter.build().name("mqtt_disconnect_total").help("Total mqtt disconnect messages.")
                    .register();

    public static final Counter mqtt_sessions_total =
            Counter.build().name("mqtt_sessions_total").help("Total mqtt sessions object created.")
                    .register();

}
